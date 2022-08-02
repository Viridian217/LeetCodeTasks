package easy;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task876Test {

    private final Task876 task876 = new Task876();
    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(createList(new int[]{1,2,3,4,5}),createList(new int[]{3,4,5})),
                Arguments.of(createList(new int[]{1,2,3,4,5,6}),createList(new int[]{4,5,6}))
        );
    }
    @ParameterizedTest
    @MethodSource("generateData")
    void middleNodeTest(Task876.ListNode list, Task876.ListNode expected) {
        Task876.ListNode result = task876.middleNode(list);
        Assertions.assertThat(result).isEqualTo(expected);
    }
    private static Task876.ListNode createList(int[] ints){
        Task876.ListNode firstNode = new Task876.ListNode();
        Task876.ListNode currentNode = firstNode;
        int value = Integer.MIN_VALUE;
        for (int anInt : ints) {
            if (currentNode.val == value) {
                currentNode.next = new Task876.ListNode();
                currentNode = currentNode.next;
            }
            currentNode.val = anInt;
            value = anInt;
        }
        return firstNode;
    }
}