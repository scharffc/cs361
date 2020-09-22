class
    PERSON

create
    make -- name for constructor
   
feature
    -- attributes
    fname: STRING
    fage: INTEGER

    -- description of the constructor
    make (name: STRING; age: INTEGER)
        do
            fname := name
            fage := age
        end

    -- routine
    set_name(name: STRING)
        do
            fname := name
            ensure
                fname = name
        end

    -- routine - adds one to the age
    birthday
        do
            fage := fage + 1
            ensure
                fage = old fage + 1
        end
       
    -- routine - tests that 2 persons have the same age
    -- Result is pre-defined (like return)
    same_age(p1: PERSON):BOOLEAN
        do
            Result := (fage = p1.fage)
        end

end