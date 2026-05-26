Part (a) Constructor
public Account(String requestedName)
{
    if (isAvailable(requestedName))
    {
        username = requestedName;
    }
    else
    {
        int num = 1;

        while (!isAvailable(requestedName + num))
        {
            num++;
        }

        username = requestedName + num;
    }
}


Part (b) getShortenedName
public String getShortenedName()
{
    String shortName = "";

    for (int i = 0; i < username.length(); i++)
    {
        if (i < username.length() - 1 && username.charAt(i + 1) == '-')
        {
            i++; 
        }
        else if (username.charAt(i) != '-')
        {
            shortName += username.charAt(i);
        }
    }

    return shortName;
}
