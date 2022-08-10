string = input("[+] Enter your string ->")

def swap () :
    global string 

    for letter in string :
        if letter == "." :
            string.replace('.',',')

        if letter == ',' :
            string.replace(',','.')

