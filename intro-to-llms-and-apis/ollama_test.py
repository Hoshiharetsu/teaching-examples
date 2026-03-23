#1. For local work, you must download ollama and install it. Pro is that you do not need an API key

#2. We still want to pip. HOWEVER - Make sure ollama is running PRIOR to running your project code.
import ollama
print("Ollama module imported successfully.") #checking for pip recognition

#3. Test run to see if Python sees ollama.list(). If you see Models installed: models=[] - this is not a bad thing, we have to pull in the llama3 model. This is done via the command line/terminal.
print("Testing ollama.list()...")
try:
    models = ollama.list()
    print("Models installed:", models)
except Exception as e:
    print("Error when connecting to Ollama:", e)
#Once you see the Models installed, you can comment this code out.

#4. Testing with a prompt:
model_name = "gemma2" #Provides flexibility - Able to use code with other models and if the model updates.

#Asking the user to give us a prompt to run:
user_prompt = input("What would you like to ask?")

response = ollama.chat(
    model=model_name,
    #TO DO: User Input
    messages=[
        {"role": "user",
         "content": user_prompt}
    ]
)

#Testing Output based on model and message:
print("\nModel reply:")
print(response["message"]["content"])