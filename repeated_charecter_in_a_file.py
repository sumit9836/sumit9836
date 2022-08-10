name = input("Enter your file name :")

with open (name,'r') as file :
    content = file.read()


capital = ['A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','S','T','U','V','W','X','Y','Z']
small = ['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','x','y','z']

print(f"There are {len(content)} charecters & {len(content.split())} words .")

count = 0
print("\n\nThere is Capital letters count")
for item in capital :
    for letter in content :
        if item == letter :
            count +=1

    print(f"{item} = {count}")
    count = 0

print("\n\nThere is samll lletters count")

for item in small :
    for letter in content :
        if item == letter :
            count +=1

    print(f"{item} = {count}")
    count = 0