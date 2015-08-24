package CaseStudy;

//  Fig. 17.11: MenuOption.java
//  Enumeration for the credit-inquiry program's options.

public enum MenuOption
{
    //  declare contents of enum type
    ZERO_BALANCE(1),
    CREDIT_BALANCE(2),
    DEBIT_BALANCE(3),
    END(4);

    private final int value;    //  current menu option

    //  constructor
    MenuOption(int valueOption)
    {
        value = valueOption;
    }   //  end MenuOptions enum constructor

    //  return the value of a constant
    public int getValue()
    {
        return value;
    }   //  end method getValue
}   //  end enum MenuOption
