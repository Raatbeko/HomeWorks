import dao.NewsCategoryDao;
import dao.NewsDao;
import dao.impl.NewsCategoryDaoImpl;
import dao.impl.NewsDaoImpl;
import entity.NewsEntity;
import entity.NewsCategoryEntity;
import enums.Category;

public class Main {
    static  final NewsCategoryDao newsCategory = new NewsCategoryDaoImpl();
    static  final NewsDao newsDao = new NewsDaoImpl();

    public static void main(String[] args) {
        NewsCategoryEntity sport = NewsCategoryEntity.
                builder().
                newsCategory(Category.SPORT).
                build();

        NewsCategoryEntity art = NewsCategoryEntity.
                builder().
                newsCategory(Category.ART_CULTURE).
                build();

        NewsCategoryEntity politic = NewsCategoryEntity.
                builder().
                newsCategory(Category.POLITIC).
                build();

        newsCategory.addCategory(sport);
        newsCategory.addCategory(art);
        newsCategory.addCategory(politic);

        NewsEntity news = NewsEntity.
                builder().newsHeadline("Сегодняшние новости про спорт").
                newsCategory(sport).
                newsText("С 30 марта по 3 апреля в Тюмени проходит открытый чемпионат России-2022.\n" +
                        "На старт выходят лучшие биатлонисты страны, также в соревнованиях принимают участие белорусские спортсмены. Среди российских звезд олимпийские призеры Эдуард Латыпов, Карим Халили, Максим Цветков, Евгений Гараничев, Кристина Резцова и другие.\n" +
                        "\n" +
                        "Прямые трансляции чемпионата России доступны в телеэфире и на сайте matchtv.ru, комментатор — Дмитрий Губерниев.")
                .build();
        newsDao.createNewNews(news);

        System.out.println(newsCategory.getAllCategory());
        System.out.println(newsDao.getNewsByNewsHeadLine("Сегодняшние новости про спорт"));



    }
}
