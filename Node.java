public class Node<T>
{
    private T info;
    private Node<T> next;
    public Node(T info)
    {
        this.info = info;
        this.next = null;
    }
    public Node(T info, Node<T> next)
    {
        this.info = info;
        this.next = next;
    }
    public T GetInfo()
    {
        return info;
    }
    public Node<T> GetNext()
    {
        return next;
    }
    public void SetInfo(T info)
    {
        this.info = info;
    }
    public void SetNext(Node<T> next)
    {
        this.next = next;
    }
    public  String ToString()
    {
        return this.info.toString();
    }
}//Class
