package easy.tasks_701_to_800;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task733Test {
    private final Task733 task733 = new Task733();
    @Test
    void floodFillTest() {
        task733.floodFill(new int[][]{{0,0,0},{0,1,1}},1,1,1);
    }


}