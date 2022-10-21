package com.sal.dvdlibrary;

import com.sal.dvdlibrary.controller.DvdLibraryController;

public class App {
    public static void main(String[] args) {
    /*
    Instantiate the UserIO, DvDLibraryView, dvdLibraryDao, DvdLibraryController classes and call the run method
     */
        DvdLibraryController controller = new DvdLibraryController(myDao, myView);
        controller.run();
    }
}
