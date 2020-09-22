note
    description : "root class of the application"
    date        : "$Date$"
    revision    : "$Revision$"

-- use of the class person

class
    TEST

inherit
    ARGUMENTS

create
    make

feature -- declarations
    p: PERSON
    p1: PERSON
    p2: PERSON
   
feature {NONE} -- Initialization

    make
        -- Run application.
     
        do
            -- Add your code here
            print ("Hello Eiffel World!%N")
            -- create a person using the constructor make
            create p.make ("Jim",25)
           
            print(p.fname)
            print("%N")
            print(p.fage)
            print("%N")
            p.birthday
            print(p.fage)          
            print("%N")
           
            create p1.make ("Juan",24)
            create p2.make ("Carmina",24)
           
            print(p1.same_age(p1))
           
        end

end