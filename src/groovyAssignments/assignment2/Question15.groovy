package groovyAssignments.assignment2

class MyStack {
    int top = -1
    int capacity = 0
    def list

    MyStack(int capacity) {
        this.capacity = capacity
        list = new ArrayList<>(this.capacity)
    }

    def pop() {
        if (isEmpty())
            -1
        else {
            int temp = list[top]
            list[top]=null
            top--
            temp
        }
    }

    void push(def item) {
        if (isFull())
            println "MyStack Overflow"
        else {
            top++
            list[top] = item
            println "item sucessfully pushed"
        }
    }

    boolean isEmpty() {
        if (top == -1)
            true
        else false
    }

    int getSize() {
        top + 1
    }

    boolean isFull() {
        if (top + 1 >= capacity)
            true
        else false
    }
     String toString() {
        return "MyStack{" +
                "list=" + list +
                '}';
    }
}

MyStack stack = new MyStack(4)
println stack.isEmpty()

println stack.pop()
stack.push("souvik")
stack.push(1)
stack.push(1)
stack.push(1)
stack.push(1)
stack.push(1)
println stack.size
println stack.isFull()

println stack.pop()
println stack.isFull()
println stack

