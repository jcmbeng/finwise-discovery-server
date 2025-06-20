package com.finwise.discoveryserver;

import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.*;

class CustomErrorControllerTest {

    @Test
    void handleError_shouldReturnInternalServerErrorWithMessage() {
        // Arrange
        CustomErrorController controller = new CustomErrorController();

        // Act
        ResponseEntity<String> response = controller.handleError();

        // Assert
        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
        assertEquals("Direct access not authorized.", response.getBody());
    }
}