def convert_to_filename(input_str):
    # Check if the input already contains an underscore (e.g., 9_Palindrome_Number.java)
    if '_' in input_str:
        # Split the string into the numeric part and the rest of the filename
        components = input_str.split('_')
        # Extract the numeric part (removing the .java extension)
        number = components[0].replace('.py', '')
        # Extract the description part
        description = '_'.join(components[1:]).replace('.py', '')
    else:
        # If there is no underscore, assume it's in the format 'number. Description'
        components = input_str.replace('.', '').split(' ')
        number = components[0]
        description = '_'.join(components[1:])
    
    # Convert the numeric part to three digits with leading zeros
    number = number.zfill(3)
    
    # Join the components with underscores and add the .java extension
    new_name = f"{number}_{description}.py"
    
    return new_name

# Read input from the keyboard
input_str = input("Enter the string in the format 'number. Description' or 'number_Description.py': ")
filename = convert_to_filename(input_str)
print("Generated filename:")
print(filename)
