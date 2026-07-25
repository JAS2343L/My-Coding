#SIMPLE CONTACT BOOK

#functions
#list of dictionaries
#input
#loop+menu
print("\033c")
contacts = []

def add_contacts():
    name = input("\nENTER NAME: ")
    number = (input("ENTER NUMBER: "))
    contacts.append({"name":name,"number":number})
    print("\nCONTACT ADDED!\n")

def view_contacts():
    if not contacts:
        print("\nNO CONTACTS FOUND.\n")
    else:
        print("Contacts:\n")
        for C in contacts:
            print(f"- {C["name"]}: {C["number"]}")
            print()

def delete_contact():
     if not contacts:
        print("\nNO CONTACTS FOUND.\n")
     else:
         delete_name = input("ENTER NAME: ")
         delete_number = input("ENTER NUMBER: ")
         if delete_number not in contacts:
            contacts.remove({"name":delete_name, "number":delete_number})
            print("\nCONTACT REMOVED!!\n")
         else:
            print("\nCONTACT NOT FOUND!!\n")

while True:
    print("\n==== CONTACT BOOK ====")
    print("1. ADD CONTACT")
    print("2. VIEW CONTACTS")
    print("3. DELETE CONTACT(first choose view contacts then delete)")
    print("4. EXIT")
    choice = input("\nSELECT ANY ONE OPTION: ")

    if choice == "1":
        add_contacts()
    elif choice == "2":
        view_contacts()
    elif choice == "3":
        delete_contact()
    elif choice == "4" or choice == "exit":
        print("GOODBYE, HAVE A NICE DAY")
        break
    else:
        print("\nINVALID OPTION!!\n")

        