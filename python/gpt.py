import openai

response = openai.ChatCompletion.create(
    model="gpt-4",
    messages=[{"role": "system", "content": "You are an expert in machine learning."},
              {"role": "user", "content": "Explain overfitting in simple terms."}],
    temperature=0.7
)

print(response["choices"][0]["message"]["content"])
