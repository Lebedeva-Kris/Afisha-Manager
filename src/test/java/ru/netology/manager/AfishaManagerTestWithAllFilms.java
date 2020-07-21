package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.DisplayFilm;

import static org.junit.jupiter.api.Assertions.*;

public class AfishaManagerTestWithAllFilms {
    private AfishaManager manager = new AfishaManager();

    private DisplayFilm first = new DisplayFilm(1, 1, "Бладшот", "Боевик", false);
    private DisplayFilm second = new DisplayFilm(2, 2, "Вперёд", "Мультфильм", false);
    private DisplayFilm third = new DisplayFilm(3, 3, "Отель - Белград", "Комедия", false);
    private DisplayFilm fourth = new DisplayFilm(4, 4, "Джентельмены", "Боевик", false);
    private DisplayFilm fifth = new DisplayFilm(5, 5, "Человек - Невидимка", "Ужасы", false);
    private DisplayFilm sixth = new DisplayFilm(6, 6, "Толли. Мировой тур", "Мультфильм", true);
    private DisplayFilm seventh = new DisplayFilm(7, 7, "Номер один", "Комедия", true);
    private DisplayFilm eight = new DisplayFilm(8, 8, "ИП Пирогова", "Комедия", true);
    private DisplayFilm ninth = new DisplayFilm(9, 9, "Ведьмак", "Ужасы", true);
    private DisplayFilm tenth = new DisplayFilm(10, 10, "Человек - паук", "Фантастика", true);



    @BeforeEach
    public void showsUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eight);
        manager.add(ninth);
        manager.add(tenth);
    }


    @Test
    public void shouldAddAllFilms() {
        manager = new AfishaManager();
        showsUp();

        DisplayFilm[] actual = manager.getShowLast();
        DisplayFilm[] expected = new DisplayFilm[]{tenth, ninth, eight, seventh, sixth, fifth, fourth, third, second,first};

        assertArrayEquals(expected, actual);
    }

//    @Test
//    public void shouldAddLessFilms() {
//        manager = new AfishaManager(5);
//        showsUp();
//
//        DisplayFilm[] actual = manager.getShowLast();
//        DisplayFilm[] expected = new DisplayFilm[]{tenth, ninth, eight, seventh, sixth};
//
//        assertArrayEquals(expected, actual);
//    }

}