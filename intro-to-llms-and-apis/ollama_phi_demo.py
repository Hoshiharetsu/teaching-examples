import ollama

def ask(model_name: str, question: str) -> str:
    response = ollama.chat(
        model=model_name,
        messages=[{"role": "user", "content": question}]
    )
    return response["message"]["content"]

def main():
    question = "Explain what a Python list is to a beginner in 2–3 sentences."

    print("Question:")
    print(question)
    print("\n--- LLaMA 3 (llama3) ---")
    print(ask("llama3", question))

    print("\n--- Phi-3 (phi3) ---")
    print(ask("phi3", question))

if __name__ == "__main__":
    main()
