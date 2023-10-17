package easy.tasks_201_to_300;

import easy.tasks_201_to_300.Task206;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class Task206Test {

    private final Task206 task206 = new Task206();

    static Stream<Arguments> generateData() {
        return Stream.of(
                Arguments.of(createList(new int[]{1, 2, 3, 4, 5}), createList(new int[]{5, 4, 3, 2, 1})),
                Arguments.of(createList(new int[]{1, 2}), createList(new int[]{2, 1})),
                Arguments.of(createList(new int[]{}), createList(new int[]{}))
        );
    }

    @ParameterizedTest
    @MethodSource("generateData")
    void reverseListTest(Task206.ListNode list, Task206.ListNode expected) {
        Task206.ListNode result = task206.reverseList(list);
        Assertions.assertThat(result).isEqualTo(expected);
    }

    private static Task206.ListNode createList(int[] ints) {
        Task206.ListNode firstNode = new Task206.ListNode();
        Task206.ListNode currentNode = firstNode;
        for (int anInt : ints) {
            if (currentNode.val == anInt) {
                currentNode.next = new Task206.ListNode();
                currentNode = currentNode.next;
            }
            currentNode.val = anInt;
        }
        return firstNode;
    }
}
