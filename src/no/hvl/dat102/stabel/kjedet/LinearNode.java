package no.hvl.dat102.stabel.kjedet;

//************************************************************
///  Representerer en node.
//************************************************************

public class LinearNode<T> {

    private LinearNode<T> neste;
    private T element;

    /**********************************************************
      Oppretter en tom node
    **********************************************************/
    public LinearNode()  {
        this(null, null);
    }

    /**********************************************************
      Oppretter en node med et element.
    **********************************************************/
    public LinearNode (T elem) {
        this(elem, null);
    }

    public LinearNode(T elem, LinearNode<T> neste) {
        this.neste = neste;
        this.element = elem;
    }

    /**********************************************************
        Returnerer etterfølger.
    **********************************************************/
    public LinearNode<T> getNeste()  {
        return neste;
    }

    /**********************************************************
      Setter neste til node
    **********************************************************/
    public void setNeste (LinearNode<T> node)  {
        neste = node;
    }

    /**********************************************************
      Returnerer elementet til denne noden
    **********************************************************/
    public T getElement() {
        return element;
    }

    /**********************************************************
      Setter nytt element i denne noden.
    **********************************************************/
    public void setElement (T elem) {
        element = elem;
    }
}
