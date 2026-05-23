

class Practice
{

    Practice reading()
    {
        System.out.println("I am reading");
        return this;
    }
    Practice writing()
    {
        System.out.println("I am writing");
        return this;
    }
    Practice mock()
    {
        System.out.println("I will give mock");
        return this;
    }
    public static void main(String[] args) {
        
        Practice p = new Practice();

        // p.reading();
        // p.writing();
        // p.mock();

        p.reading().writing().mock();

    }
}


