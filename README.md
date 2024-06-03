# Puzzles-Stack

## Backgroud

A common implementation of your own stack is a dynamic array.

We then start appending or pushing elements to the right side of the array.

We can then pop elements from that same right side.

That gives it that last in first out quality.

There is a lazy, inefficient way to quickly spin up a stack.

We would create a dynamic array and append and pop from the right.

This is inefficient; whenever the programming language needs more memory,
then we need to copy every value we have, put it in a new memory block.
Then we can keep the array growing.

The alternative is to use the linked list data structure.

When you push an element, then you create a node.

The list keeps getting joined as new elements (nodes) are pushed.

This is an O(1) operation.

When you pop an element, then you remove a node.

## Inefficient Stack

Try the array-based solution.

As expected, the array-based solution is inefficient and has trade-offs.

Every time the next push exceeds the current stack capacity,
the solution needs to temporarily create a new stack array
that is incrementally increased by the stack capacity constant.

The stack capacity constant is a trade-off as well.
Too small, and the stack is re-sized often.
Too big, and the stack holds too much space in memory that might not be used.

## Efficient Stack

This stack will use a singly linked list to add and remove nodes as needed.

The `EfficientStack` simply adds the nomenclature of a stack.

The `EfficientStack` delegates to the `SinglyLinkedList` data structure
to manage the stack logic.

The `SinglyLinkedList` delegates the entries into the data structure to `Node`.

The `Node` stores a value and a pointer to the previous node.

Now the stack will only use as much memory as there are nodes in the list.

## Build

An alternative to build follows.

```
rm -v *.class
find . -name "*.java" > sources.txt
javac @sources.txt
```
