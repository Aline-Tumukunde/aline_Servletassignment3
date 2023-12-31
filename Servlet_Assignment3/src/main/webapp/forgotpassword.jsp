<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
 <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap');
    </style>
<title>Forgot Password</title>
<style>
        body {
            font-family: Arial, sans-serif;
            background-color: #3d4c6d;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            font-family: 'Poppins', sans-serif;
        }

        .reset-password-container {
            background-color: #fff;
            border: 1px solid #ccc;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            width: 420px;
            text-align: center;
        }

        h2 {
            margin-bottom: 20px;
        }

        .form-group {
            margin-bottom: 15px;
        }

        label {
            display: block;
            margin-bottom: 5px;
        }

        input[type="email"] {
            width: 400px;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 3px;
        }

        button {
            background-color: #3d4c6d;
            color: #fff;
            border: none;
            padding: 10px 20px;
            border-radius: 3px;
            cursor: pointer;
        }

        button:hover {
            background-color: #4f5f70;
        }
        input[type="email"].invalid {
            border: 1px solid red;
        }
        .error-message {
            color: red;
        }
    </style>
</head>
<body>
<div class="reset-password-container">
    <h2>Reset Password</h2>
    <form id="reset-password-form" method="post" action="ResetPasswordServlet">
        <div class="form-group">
            <label for="email">Email</label>
            <input type="email" id="email" name="email" required>
            <span id="emailError" class="error-message"></span>
        </div>
        <button type="submit">Reset Password</button>
    </form>
</div>
<script>
        document.addEventListener('DOMContentLoaded', function () {
            const resetPasswordForm = document.getElementById('reset-password-form');
            const emailInput = document.getElementById('email');
            const emailError = document.getElementById('emailError');
            resetPasswordForm.addEventListener('submit', function (e) {
                e.preventDefault();

               
                const enteredEmail = emailInput.value;

               
                const emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

                if (!emailRegex.test(enteredEmail)) {
                   
                    emailInput.classList.add('invalid');
                    emailError.textContent = 'Invalid email address';
                } else {
                    
                    emailInput.classList.remove('invalid');
                    emailError.textContent = '';
                    const isPasswordResetSuccessful = true;

                    if (isPasswordResetSuccessful) {
                       
                        window.location.href = 'signin.html';
                    } else {
                        alert('Password reset failed. Please try again.');
                    }
                }
            });
            emailInput.addEventListener('input', function () {
                emailInput.classList.remove('invalid');
                emailError.textContent = '';
            });
        });
    </script>
</body>
</html>