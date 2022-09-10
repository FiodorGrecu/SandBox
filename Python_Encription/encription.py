from cryptography.fernet import Fernet


key = Fernet.generate_key()
print(key)

fernet = Fernet(key)
message = "Super"
token = fernet.encrypt()

print("origional string:", message)
print("encrypted string:", token)
