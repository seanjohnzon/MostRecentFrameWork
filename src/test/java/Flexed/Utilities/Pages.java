package Flexed.Utilities;

import Flexed.Pages.*;

public class Pages {
    private Chapter8Page chapter8Page;
    private MainPage mainPage;


    public Chapter8Page getChapter8Page() {
        if(chapter8Page == null){
            chapter8Page = new Chapter8Page();

        }
        return chapter8Page;
    }

    public MainPage getMainPage() {
        if(mainPage == null){
            mainPage = new MainPage();
        }
        return mainPage;
    }
}
