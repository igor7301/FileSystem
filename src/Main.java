import commandpattern.CommandCopyDirectory;
import commandpattern.CommandPrintInfo;
import commandpattern.Scheduler;
import filesystem.FileSystem;
import filesystem.FileSystemFactory;
import filesystem.Observer;
import filesystem.directory.Directory;
import filesystem.directory.DirectoryFactory;
import filesystem.file.MyFile;
import filesystem.ide.BottomTabObserver;
import filesystem.ide.TopTabObserver;

/**
 * Created by Igor on 01.12.15.
 */
public class Main {

    public static void main(String[] args) {

        //------------Fabric, Template Method, Proxy----------------
        final String systemName = "WIN";

        FileSystem fileSystem = FileSystemFactory.get(systemName);

        Directory dir1 = DirectoryFactory.get(systemName, "DIR1");
        Directory dir2 = DirectoryFactory.get(systemName, "DIR2");
        Directory dir3 = DirectoryFactory.get(systemName, "DIR3");
        Directory dir4 = DirectoryFactory.get(systemName, "DIR4");
        Directory dir5 = DirectoryFactory.get(systemName, "DIR5");



        MyFile myFile = new MyFile("MyFile.txt");
        fileSystem.add(dir1);
        dir1.add(dir2);
        dir1.add(dir3);
        dir3.add(myFile);
        dir3.add(new MyFile("MyLink.txt"));
        dir1.add(dir4);
        fileSystem.add(dir5);
        //dir5.copy(dir3);


        //---------------COMMAND----------------------------
        Scheduler scheduler = new Scheduler();

        scheduler.add(new CommandCopyDirectory(dir5, dir3));
        scheduler.add(new CommandPrintInfo(fileSystem));


        scheduler.execute();

        //--------------OBSERVER---------------------------------

        System.out.println("------------------Observer-----------------------------");
        Observer topTab = new TopTabObserver();
        topTab.add(myFile);//TopTab - it is Observer
        new BottomTabObserver().add(myFile);

        myFile.setName("newFile.txt");

        System.out.println("-----------------------------------------------");
        topTab.remove(myFile);
        myFile.setName("newFile.txt");






        //-------------ITERATOR--------------------------------------------

//        IteratorFileSystem iterator = new IteratorFileSystem(fileSystem);
//        iterator.read();


//        Iterator iterator = new IteratorFileSystem(fileSystem);
//        while (iterator.hasNext()) {
//            System.out.println(((FileSystemElement) iterator.next()).getName());
//        }


        //---------------BUILDER-----------------------------

//        FileBuilder fileBuilder = new FileBuilderXML();
//        Person person = new Person();
//
//        person.setName("Igor");
//        person.setEmail("igor@komarov.com");
//
//        person.createFile(fileBuilder);
//
//        System.out.println(fileBuilder.getResults());


        //-------------DECORATOR---------------------------

//        Car car = new CarToyota();
//        System.out.println("Toyota base cost = " + car.getCost());
//
//        car = new DecoratorABS(car);
//        System.out.println("Toyota with ABS = " + car.getCost());
//
//        car = new DecoratorSRS(car);
//        System.out.println("Toyota with ABS and SRS = " + car.getCost());
//
//
//        System.out.println("--------------------------");
//        car = new CarNissan();
//        System.out.println("Nissan base cost = " + car.getCost());
//
//        car = new DecoratorABS(car);
//        System.out.println("Nissan with ABS = " + car.getCost());
//
//        car = new DecoratorAudio(car);
//        System.out.println("Nissan with ABS and Audio = " + car.getCost());


        //-------------ADAPTER------------------------

//
//        Enumeration<Integer> enumeration =  new Vector(Arrays.asList(1,2,3,4)).elements();
//
//        IteratorToEnumerationAdapter adapter = new IteratorToEnumerationAdapter(enumeration);
//
//        while (adapter.hasNext()) {
//            System.out.println(adapter.next());
//        }

    }
}
