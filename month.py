from time import sleep

month = input("Enter your month name :")

sleep(2)

if month == "January" or month == "July" or month =="March" or month == "May"or month == "August"or month == "October"or month == "December" :
    print("This month have 31 days.")

elif month == "April"or month == "June" or month == "November"or month == "September" :
    print("This month have 30 days.")

else :
    print("This month have 28/29 days")