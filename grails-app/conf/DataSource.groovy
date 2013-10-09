hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    //cache.provider_class='com.opensymphony.oscache.hibernate.OSCacheProvider'
    cache.provider_class = 'net.sf.ehcache.hibernate.EhCacheProvider'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            pooled = true
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/db"
            username = "root"
            password = ""
            dialect = "org.hibernate.dialect.PostgreSQLDialect"
            properties { 
                validationQuery="select 1" 
                testWhileIdle=true 
                timeBetweenEvictionRunsMillis=60000
            } 
        }   
    }
    production {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            pooled = true
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://10.0.2.12:64769/t"
            username = "azbdmlw3bryjcjup"
            password = "a2xt1f262es11cn2gcfgkyxptu2jhxk9"
            dialect = "org.hibernate.dialect.PostgreSQLDialect"
            properties { 
                validationQuery="select 1" 
                testWhileIdle=true 
                timeBetweenEvictionRunsMillis=60000
            }
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop','update'
            pooled = true
            driverClassName = "org.postgresql.Driver"
            url = "jdbc:postgresql://localhost:5432/db"
            username = "root"
            password = ""
            dialect = "org.hibernate.dialect.PostgreSQLDialect"
        }
    }
}
