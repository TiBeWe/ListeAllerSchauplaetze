version: '3.8'

services:
   db:
      image: mariadb
      container_name: mariaDB
      ports:
       - '3306:3306'
      environment:
        MYSQL_ROOT_PASSWORD: 1234
        MYSQL_DATABASE: ListeAllerSchauplaetze
      volumes:
        - dbdata:/var/lib/mysql        
      deploy:     
         restart_policy:
            condition: on-failure
            max_attempts: 3

   app:
      depends_on:
       - db
      image: phpmyadmin/phpmyadmin
      container_name: phpmyadmin
      ports:
       - '80:80'
      environment:
        PMA_HOST: db
        PMA_USER: root
        PMA_PASSWORD: 1234
      deploy:     
         restart_policy:
            condition: on-failure
            max_attempts: 3

volumes:
    dbdata:
