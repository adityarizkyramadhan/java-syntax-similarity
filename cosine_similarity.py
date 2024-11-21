import javalang
import re
from collections import Counter
import numpy as np


def clean_code(code):
    code = re.sub(r'//.*', '', code)
    code = re.sub(r'/\*[\s\S]*?\*/', '', code)
    code = re.sub(r'import\s+.*;', '', code)
    return re.sub(r'\s+', ' ', code).strip()


def tokenize_code(cleaned_code):
    try:
        tokens = list(javalang.tokenizer.tokenize(cleaned_code))
        token_values = [token.value for token in tokens]
        return token_values
    except javalang.tokenizer.LexerError as e:
        print(f"LexerError: {e}")
        return []
    except javalang.parser.JavaSyntaxError as e:
        print(f"JavaSyntaxError: {e}")
        return []


# Fungsi untuk menghasilkan N-grams
def generate_n_grams(tokens, n=4):
    tokens_as_strings = [token for token in tokens]
    ngrams = [" ".join(tokens_as_strings[i:i + n]) for i in range(len(tokens_as_strings) - n + 1)]
    return ngrams

# Fungsi untuk menghitung TF
def compute_tf(n_grams, unique_ngrams):
    freq_ngrams = Counter(tuple(n) for n in n_grams)
    tf_vector = np.array([freq_ngrams.get(ng, 0) for ng in unique_ngrams])
    return tf_vector / len(n_grams)

# Fungsi untuk menghitung IDF
def compute_idf(documents, unique_ngrams):
    N = len(documents)
    idf_vector = np.zeros(len(unique_ngrams))
    for i, ngram in enumerate(unique_ngrams):
        df = sum(1 for doc in documents if ngram in doc)  # menghitung document frequency
        idf_vector[i] = np.log((N / (df + 1))) + 1  # perhitungan IDF dengan smoothing
    return idf_vector


def cosine_similarity(tfidf_ngrams1, tfidf_ngrams2):
    dot_product = np.dot(tfidf_ngrams1, tfidf_ngrams2)
    magnitude_ngrams1 = np.sqrt(np.dot(tfidf_ngrams1, tfidf_ngrams1))
    magnitude_ngrams2 = np.sqrt(np.dot(tfidf_ngrams2, tfidf_ngrams2))
    return dot_product / (magnitude_ngrams1 * magnitude_ngrams2) if magnitude_ngrams1 > 0 and magnitude_ngrams2 > 0 else 0.0


def similarity_check(code1, code2):
    # Membersihkan kode
    cleaned_code1, cleaned_code2 = clean_code(code1), clean_code(code2)

    # Tokenisasi kode
    tokens1, tokens2 = tokenize_code(
        cleaned_code1), tokenize_code(cleaned_code2)

    # Konversi token menjadi ID
    token_ids1, token_ids2 = tokens_to_ids(tokens1), tokens_to_ids(tokens2)

    # Generate N-grams sebagai tuple agar dapat digunakan dalam set
    n_grams_1 = [tuple(n) for n in generate_n_grams(token_ids1)]
    n_grams_2 = [tuple(n) for n in generate_n_grams(token_ids2)]

    # Mendapatkan N-grams unik
    unique_ngrams = list(set(n_grams_1).union(set(n_grams_2)))

    # Menghitung TF
    tf_ngrams1 = compute_tf(n_grams_1, unique_ngrams)
    tf_ngrams2 = compute_tf(n_grams_2, unique_ngrams)

    # Menghitung IDF
    idf_vector = compute_idf([n_grams_1, n_grams_2], unique_ngrams)

    # Menghitung TF-IDF
    tfidf_ngrams1 = tf_ngrams1 * idf_vector
    tfidf_ngrams2 = tf_ngrams2 * idf_vector

    # Menghitung cosine similarity
    similarity_score = cosine_similarity(tfidf_ngrams1, tfidf_ngrams2)

    # Menentukan hasil berdasarkan threshold
    result = 'sama' if similarity_score > threshold else 'tidak sama'
    return result, similarity_score
