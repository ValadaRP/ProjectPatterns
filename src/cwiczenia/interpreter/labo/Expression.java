package cwiczenia.interpreter.labo;

import java.util.*;

interface Expression 
{
    public int interpret(Map<String,Expression> variables);
}



