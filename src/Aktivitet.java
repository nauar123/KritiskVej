public class Aktivitet {

    // Opgave 1 · Lav en klasse ved navn Aktivitet, som indeholder attributterne event (int), task (String)
    // og duration (int) med de sædvanlige metoder (constructors, get-metoder).

    private int event;
    private String task;
    private int duration;
    // vores 3 artiputter


    public Aktivitet() // default contructor
    {}

    public Aktivitet (int e, String t, int d)
    {
        event = e;
        task = t;
        duration = d;
    }

    public int getEvent()
    {
        return event;
    }

    public String getTask()
    {
        return task;
    }

    public int getDuration()
    {
        return duration;
    }


}





