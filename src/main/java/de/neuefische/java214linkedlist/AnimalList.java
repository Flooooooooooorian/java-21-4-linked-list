package de.neuefische.java214linkedlist;

import de.neuefische.java214linkedlist.AnimalListItem;

public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal) {
        if(head == null) {
            head = new AnimalListItem(animal);
        }
        else {
            getTail().setNext(new AnimalListItem(animal));
        }
    }

    private AnimalListItem getTail() {
        AnimalListItem tail = head;
        while(tail.getNext() != null) {
            tail = tail.getNext();
        }

        return tail;
    }

    public void remove(Animal animal) {
        while(head != null && head.getValue().getName().equals(animal.getName())) {
            head = head.getNext();
        }

        if (head == null) {
            return;
        }

        AnimalListItem item = head;

        while(item.getNext() != null) {
            if (item.getNext().getValue().getName().equals(animal.getName())) {
                item.setNext(item.getNext().getNext());
            }
            else {
                item = item.getNext();
            }
        }
    }

    @Override
    public String toString() {
        if (head == null) {
            return "";
        }

        StringBuilder builder = new StringBuilder(head.getValue().toString());
        AnimalListItem item = head.getNext();

        while (item != null) {
            builder.append(" -> ").append(item.getValue());
            item = item.getNext();
        }

        return builder.toString();
    }
}
