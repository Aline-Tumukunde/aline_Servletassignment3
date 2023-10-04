		function validateForm() {
            const firstName = document.getElementById("firstName");
            const lastName = document.getElementById("lastName");
            const address = document.getElementById("address");
            const dob = document.getElementById("dob");
            const email = document.getElementById("email");
            const phone = document.getElementById("phone");
            const gender = document.getElementById("gender");
            const motherName = document.getElementById("motherName");
            const fatherName = document.getElementById("fatherName");
            const department = document.getElementById("department");
            const picture = document.getElementById("picture");
            const certificate = document.getElementById("certificate");
            const errors = {};
            if (firstName.value.trim() === "") {
                errors.firstName = "First Name cannot be empty";
            }
            if (lastName.value.trim() === "") {
                errors.lastName = "Last Name cannot be empty";
            }
            if (address.value.trim() === "") {
                errors.address = "Address cannot be empty";
            }
            if (dob.value.trim() === "") {
                errors.dob = "Date of Birth cannot be empty";
            }
            const emailRegex = /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;
            if (!emailRegex.test(email.value)) {
                errors.email = "Invalid email address";
            }
            const phoneRegex = /^[0-9]{10}$/;
            if (!phoneRegex.test(phone.value)) {
                errors.phone = "Invalid phone number (10 digits)";
            }

            if (gender.value.trim() === "") {
                errors.gender = "Please select a gender";
            }

            if (motherName.value.trim() === "") {
                errors.motherName = "Mother's Name cannot be empty";
            }
            if (fatherName.value.trim() === "") {
                errors.fatherName = "Father's Name cannot be empty";
            }

            if (department.value.trim() === "") {
                errors.department = "Department cannot be empty"; }

            if (picture.value.trim() !== "") {
                const allowedExtensions = /\.(jpg|png)$/i;
                if (!allowedExtensions.test(picture.value)) {
                    errors.picture = "Invalid file format for Passport Picture. Please use JPG or PNG.";
                }}
            if (certificate.value.trim() !== "") {
                const allowedExtensions = /\.(pdf)$/i;
                if (!allowedExtensions.test(certificate.value)) {
                    errors.certificate = "Invalid file format for Certificate. Please use PDF.";
                } }
            for (const field in errors) {
                if (errors.hasOwnProperty(field)) {
                    const errorSpan = document.getElementById(`${field}Error`);
                    if (errorSpan) {
                        errorSpan.textContent = errors[field];
                    } }
            }
            if (Object.keys(errors).length > 0) {
                return false; 
            }
        }
        
        //javascript codes to change languages 
        function changeLanguage() {
        const selectedLanguage = document.getElementById("languageSelect").value;
        const translations = {
            english: {
                formTitle: "Student Admission Form",

            },
            french: {
                formTitle: "Formulaire d'admission des étudiants",
    "firstNameLabel": "Prénom",
    "lastNameLabel": "Nom de Famille",
    "addressLabel": "Adresse",
    "dobLabel": "Date de Naissance",
    "emailLabel": "Adresse Email",
    "phoneLabel": "Numéro de Téléphone",
    "genderLabel": "Genre",
    "maleOption": "Homme",
    "femaleOption": "Femme",
    "otherOption": "Autre",
    "motherNameLabel": "Nom de la Mère",
    "fatherNameLabel": "Nom du Père",
    "departmentLabel": "Département",
    "pictureLabel": "Photo de Passeport",
    "certificateLabel": "Certificat",
    "submitButtonText": "Soumettre",
    "loginLinkText": "Déjà un compte? Se Connecter"
            },
            kinyarwanda: {
            formTitle: "form yumunyeshuri yo kwiyandikisha",     
            "firstNameLabel": "Izina ry'Umuntu wa Mbere",
"lastNameLabel": "Izina ry'Umuntu wa Kabiri",
"addressLabel": "Ibirimo",
"dobLabel": "Itariki y'Amavuko",
"emailLabel": "Imeyili",
"phoneLabel": "Nimero ya Telefone",
"genderLabel": "Igitsina",
"maleOption": "Umuhungu",
"femaleOption": "Umugore",
"otherOption": "Igitsina Gikorwa",
"motherNameLabel": "Izina ry'Umubyeyi",
"fatherNameLabel": "Izina ry'Umupfasoni",
"departmentLabel": "Ibihugu",
"pictureLabel": "Igiswaga cy'Amasambu",
"certificateLabel": "Igiswaga",
"submitButtonText": "Ohereza",
"loginLinkText": "Mwakoze konti? Kanda hano kujya"
 
            }
        };
        for (const key in translations[selectedLanguage]) {
            if (translations[selectedLanguage].hasOwnProperty(key)) {
                const element = document.querySelector(`[data-i18n="${key}"]`);
                if (element) {
                    element.textContent = translations[selectedLanguage][key];
                }
            }
        }
    }