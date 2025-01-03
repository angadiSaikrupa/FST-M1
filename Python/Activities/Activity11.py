	
fruits = {
    "apple": 80,
    "banana": 60,
    "orange": 50,
    "peaches": 70
}
 
search_term = input("What are you looking for? ")
 
if(search_term in fruits):
    print(search_term+"costs"+str(fruits[search_term])+"rupees")
else:
    print("No, this is not available")
