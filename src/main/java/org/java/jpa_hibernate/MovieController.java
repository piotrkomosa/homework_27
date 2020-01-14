package org.java.jpa_hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.persistence.*;
import java.util.List;

@Controller
public class MovieController {

    public MovieRepository movieRepository;

    @Autowired
    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;

    @PostMapping("/save")
    public String movieAdd(@ModelAttribute Movie movie) {
EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(movie);
        entityManager.getTransaction().commit();
        return "redirect:movie";
    }
    @GetMapping("/movie")
    public String newUser(Model model) {
        Movie movie = new Movie();
        model.addAttribute("movie", movie);
        return "MovieWeb.html";
    }
    @GetMapping("/show")
    public String showAll(Model model) {
        List<Movie> allMovies = movieRepository.findAll();
        model.addAttribute("show", allMovies);
        return "All.html";
    }
}
