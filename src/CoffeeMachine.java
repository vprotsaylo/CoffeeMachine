class CoffeeMachine
{
    //process input and sends it to the responsible hardware
    private CashBox cashBox;
    private FrontPanel frontPanel;
    private DispenserRegister dispenserReg;
    private ProductRegister productReg;

    // constructor function called when CoffeeMachine is created
    public CoffeeMachine()
    {
        cashBox = new CashBox();
        frontPanel = new FrontPanel();
        dispenserReg = new DispenserRegister();
        productReg = new ProductRegister();

        // Load-up the ingredients - normally would
        // obtain externally:
        Ingredient cup = new Ingredient("cup");
        Ingredient coffee = new Ingredient("coffee");
        Ingredient creamer = new Ingredient("creamer");
        Ingredient sugar = new Ingredient("sugar");
        Ingredient water = new Ingredient("water");
        Ingredient bouillonPowder = new Ingredient("bouillon");

        dispenserReg.addDispenser(new Dispenser(cup, 30)); //30 cups
        dispenserReg.addDispenser(new Dispenser(coffee, 10));
        dispenserReg.addDispenser(new Dispenser(creamer, 1)); //only one shot of cream
        dispenserReg.addDispenser(new Dispenser(sugar, 10));
        dispenserReg.addDispenser(new Dispenser(water, 30));
        dispenserReg.addDispenser(new Dispenser(bouillonPowder, 5)); // only 5 shots of bouillon powder

        // Load-up the Products - normally would obtain externally:
        Product black = new Product("black", 5, new Recipe(cup, coffee, water, null, null));
        Product white = new Product("white", 5, new Recipe(cup, coffee, creamer, water, null));
        Product sweet = new Product("sweet", 5, new Recipe(cup, coffee, sugar, water, null));
        Product whiteSweet = new Product("whiteSweet", 5, new Recipe(cup, coffee, sugar, creamer, water));
        Product bouillon = new Product("bouillon", 6, new Recipe(cup, bouillonPowder, water, null, null));

        productReg.addProduct(black); //product 1 is black coffee
        productReg.addProduct(white); //product 2 is coffee with cream
        productReg.addProduct(sweet); //product 3 is coffee with sugar
        productReg.addProduct(whiteSweet); //product 4 is coffee with cream & sugar
        productReg.addProduct(bouillon); //product 5 is bouillon
    }

    public boolean doOneAction()
    {
        // Reads commands and executes them.
        String command;
        Output.print("Menu: I=Insert, S=Select, R=Return, Q=Quit>");
        command = Input.readString();

        if (!command.equals("Q"))
        {
            if (command.equals("I"))
            {
                int value;
                Output.print("Amount>");
                value = Input.readInt();
                cashBox.deposit(value);
            }
            else if (command.equals("S"))
            {
                int selection;

                Output.print("Select Drink (1=Black Coffee, 2=Coffee w/Cream, 3=Coffee w/Sugar, 4=Coffee w/Sugar & Cream, 5=Bouillon)>");

                
                selection = Input.readInt();
                frontPanel.select(selection, cashBox, productReg, dispenserReg);
            }
            else if (command.equals("R"))
            {
                cashBox.returnCoins();
            }
            return true;
        }
        else return false;
    }
}