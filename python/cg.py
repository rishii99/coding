import pygame
import sys

# Initialize Pygame
pygame.init()

# Set up the display
width, height = 800, 600
screen = pygame.display.set_mode((width, height))
pygame.display.set_caption('Divide Screen and Draw Shapes')

# Define colors
white = (255, 255, 255)
black = (0, 0, 0)
red = (255, 0, 0)
green = (0, 255, 0)
blue = (0, 0, 255)

# Main loop
running = True
while running:
    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False

    # Fill the background
    screen.fill(white)

    # Draw dividing lines
    pygame.draw.line(screen, black, (width // 2, 0), (width // 2, height), 2)
    pygame.draw.line(screen, black, (0, height // 2), (width, height // 2), 2)

    # Draw shapes
    # Top-left: Circle
    pygame.draw.circle(screen, red, (width // 4, height // 4), 50)

    # Top-right: Rectangle
    pygame.draw.rect(screen, green, (3 * width // 4 - 50, height // 4 - 25, 100, 50))

    # Bottom-left: Arc (Adjusted size & thickness)
    arc_rect = pygame.Rect(width // 4 - 60, 3 * height // 4 - 40, 120, 80)
    pygame.draw.arc(screen, blue, arc_rect, 0, 3.14, 5)

    # Bottom-right: Ellipse
    pygame.draw.ellipse(screen, black, (3 * width // 4 - 50, 3 * height // 4 - 25, 100, 50), 2)

    # Update the display
    pygame.display.flip()

# Quit Pygame
pygame.quit()
sys.exit()
