package com.profeel.nexus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Profeel Nexus - AI-Powered E-Learning Platform
 * 
 * This is the main Spring Boot application class that bootstraps the entire
 * e-learning platform. The application provides comprehensive learning
 * management features powered by artificial intelligence.
 * 
 * Key Features:
 * - User management and authentication
 * - Course creation and management
 * - AI-powered content recommendations
 * - Progress tracking and analytics
 * - Interactive learning modules
 * - Assessment and grading system
 * 
 * @author Profeel Team
 * @version 1.0.0
 * @since 2025
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.profeel.nexus.repository")
@EnableTransactionManagement
@EnableCaching
@EnableAsync
@EnableScheduling
public class ProfeelNexusApplication {

	/**
	 * Main method to start the Spring Boot application.
	 * 
	 * @param args command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ProfeelNexusApplication.class);
		
		// Set default profile if none is specified
		app.setAdditionalProfiles("dev");
		
		// Add custom banner
		app.setBannerMode(org.springframework.boot.Banner.Mode.CONSOLE);
		
		// Start the application
		app.run(args);
		
		System.out.println("\n" +
			"=================================================\n" +
			"🚀 Profeel Nexus E-Learning Platform Started! 🚀\n" +
			"=================================================\n" +
			"📚 Access the API at: http://localhost:8080/api\n" +
			"📊 Health Check: http://localhost:8080/api/actuator/health\n" +
			"📖 Documentation: Coming Soon...\n" +
			"=================================================\n");
	}
}
