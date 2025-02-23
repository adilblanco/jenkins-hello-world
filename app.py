def replace_jenkins(text):
    return text.replace("Jenkins", "World")

if __name__ == "__main__":
    input_text = "Hello Jenkins!"
    output_text = replace_jenkins(input_text)
    print(output_text)
