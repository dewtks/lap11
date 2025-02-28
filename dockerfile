# Use the official Nginx base image
FROM nginx:latest

# Set the maintainer
LABEL maintainer="your_email@example.com"

# Copy index.html to the Nginx web root
COPY index.html /usr/share/nginx/html/index.html

# Expose port 8000 instead of the default 80
EXPOSE 8000

# Run Nginx in the foreground
CMD ["nginx", "-g", "daemon off;"]
