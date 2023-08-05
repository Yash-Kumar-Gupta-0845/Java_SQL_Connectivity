package org.example;

class StudentDaoFactory {
    public  static StudentDao studentDao=null;
    private StudentDaoFactory(){

    }
    public static StudentDao getStudentDao()
    {
        if (studentDao==null)
        {
            studentDao= new StudentDaoImpl();
        }
        return studentDao;

    }


}
