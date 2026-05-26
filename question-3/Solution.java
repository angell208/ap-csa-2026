public int moreHistoryThanMathAbsences()
{
    int count = 0;

    for (CourseRecord historyStudent : historyList)
    {
        for (CourseRecord mathStudent : mathList)
        {
            if (historyStudent.getStudentID().equals(mathStudent.getStudentID()) &&
                historyStudent.getAbsences() > mathStudent.getAbsences())
            {
                count++;
            }
        }
    }

    return count;
}
