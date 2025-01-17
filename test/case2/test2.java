package test.case2;

public class test2 {
    public static void main(String[] args) {
        Library libraryA = createLibrary();
        Library libraryA1 = libraryA;
        Library libraryB = createLibrary();

        System.out.println("libraryA = " + libraryA.findBooks());
        System.out.println("libraryA1 = " + libraryA1.findBooks());
        System.out.println("libraryB = " + libraryB.findBooks());

        System.out.println();
        libraryA.changeBooks(3, new Book("그 많던 싱아는 누가 다 먹었을까", "박완서"));
        libraryB.addBook(new Book("사피엔스", "유발 하라리"));

        System.out.println("libraryA = " + libraryA.findBooks());
        System.out.println("libraryA1 = " + libraryA1.findBooks());
        System.out.println("libraryB = " + libraryB.findBooks());
    }

    /*
    초기에만 실행
     */
    private static Library createLibrary() {
        Library library = new Library();
        library.addBook(new Book("태백산맥", "조정래"));
        library.addBook(new Book("이기적 유전자", "리처드 도킨스"));
        library.addBook(new Book("자전거 도둑", "박완서"));
        library.addBook(new Book("토지", "박경리"));
        library.addBook(new Book("대변동", "제레드 다이아몬드"));
        return library;
    }
}

