package ua;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ua.crm.DB.UserService;
import ua.turbosms.TurboSmsDao;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(final UserService userService, final TurboSmsDao turboSmsDao) {
        return new CommandLineRunner() {
            @Override
            public void run(String... strings) throws Exception {
//                userService.addUser(new CustomUser("admin", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.ADMIN));
//                userService.addUser(new CustomUser("user", "5baa61e4c9b93f3f0682250b6cf8331b7ee68fd8", UserRole.USER));
                //turboSmsDao.save(new TurboSms());


            }
        };
    }
}