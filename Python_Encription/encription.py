from cryptography.fernet import Fernet


key = Fernet.generate_key()

fernet = Fernet(key)
message = "Super Cool"
token = fernet.encrypt()

print("origional string:", message)
print("encrypted string:", token)
