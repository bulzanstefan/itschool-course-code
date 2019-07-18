package ro.itschool.curs7;

interface AccessProvider {

    void open(int distance);

    void closeSpace();

    void lock();
}
