package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task21Test {
    private final Task21 task21 = new Task21();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(createList(new int[]{1,2,4}),createList(new int[]{1,3,4}),createList(new int[]{1,1,2,3,4,4})),
                Arguments.of(createList(new int[]{}),createList(new int[]{}), createList(new int[]{})),
                Arguments.of(createList(new int[]{}), createList(new int[]{0}), createList(new int[]{0}))
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void mergeTwoListsTest(Task21.ListNode list1, Task21.ListNode list2, Task21.ListNode expected) {
        Task21.ListNode result = task21.mergeTwoLists(list1,list2);
        Assertions.assertThat(result).isEqualTo(expected);
    }
    private static Task21.ListNode createList(int[] ints){
        Task21.ListNode firstNode =  new Task21.ListNode();
        Task21.ListNode currentNode = firstNode;
        for (int anInt : ints) {
            if (currentNode.val == anInt) {
                currentNode.next = new Task21.ListNode();
                currentNode = currentNode.next;
            }
            currentNode.val = anInt;
        }
        return firstNode;
    }
}