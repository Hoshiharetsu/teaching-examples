from groq import Groq
import os

# Client automatically reads the GROQ_API_KEY environment variable
# Remember with API: YOU DO NOT SHARE THIS!!!!
# Check if the environment variable is set
api_key = os.environ.get("GROQ_API_KEY")

# If the export didn't work (common in IDEs), you can paste your key below
if not api_key:
    api_key = ""  # <--- PASTE YOUR API KEY INSIDE THESE QUOTES

client = Groq(api_key=api_key)

def main():
    #Part 1: Create our user prompt:
    user_prompt = "Tell me a story involving learning how to program" #You can change this to see the output changes.

    #Part 2: Handling the user prompt
    chat_completion = client.chat.completions.create( # type: ignore
        model="llama-3.1-8b-instant", #Define which LLM to use for the response.
        messages=[
            {
                "role": "system",
                "content": (
                    "You are a friendly programming tutor helping new "
                    "community college students learning Python."
                ),
            },
            {"role": "user", "content": user_prompt},
        ],
        max_tokens=200, #Unit of text used by LLMs to read and generate information
        temperature=0.7, #Controls creativity and predictability of model responses
    )

    answer = chat_completion.choices[0].message.content
    print("USER PROMPT:")
    print(user_prompt)
    print("\nMODEL ANSWER:")
    print(answer)


if __name__ == "__main__":
    main()