package cloud.xiguapi.datastructure.linearlist;

/**
 * 动态数组实现类
 *
 * @author 大大大西西瓜皮🍉
 * @since 2020-11-8 下午 04:08
 * desc:
 */
public class DynamicArray<T> {

    /**
     * 数据域
     */
    private T[] data;

    /**
     * 容量
     */
    private int capacity;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
    }

    public DynamicArray() {
        this.capacity = 10;
    }
}
