package com.codeclan.example.FolderFun.components;
import com.codeclan.example.FolderFun.models.File;
import com.codeclan.example.FolderFun.models.Folder;
import com.codeclan.example.FolderFun.models.User;
import com.codeclan.example.FolderFun.repositories.FileRepository;
import com.codeclan.example.FolderFun.repositories.FolderRepository;
import com.codeclan.example.FolderFun.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        Folder funstuff = new Folder("FunStuff");
        folderRepository.save(funstuff);
        Folder boringstuff = new Folder("BoringStuff");
        folderRepository.save(boringstuff);
        File homework = new File("Homework", "rb", 50);
        fileRepository.save(homework);
        File morehw = new File("morehw", "exe", 55);
        fileRepository.save(morehw);
        User john = new User("John");
        userRepository.save(john);
        User user2 = new User("User2");
        userRepository.save(user2);
    }
}
