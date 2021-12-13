public class Main {
    public static void main(String[] args) {
        var Item = new Item();
        Item.inventory();

        var tableSize = new TableSize();
        tableSize.createTableSize();

        var contentTable = new ContentTable();
        contentTable.createTable();
    }
}
