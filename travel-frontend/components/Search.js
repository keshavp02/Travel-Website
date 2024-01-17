"use client"
import React, { useState } from 'react';
import {
    Box,
    Heading,
    Input,
    Button,
    Flex,
    FormControl,
    FormLabel,
} from '@chakra-ui/react';

const Home = () => {
    const [formData, setFormData] = useState({
        destination: '',
        fromDate: '',
        toDate: '',
        numberOfPeople: 1,
    });

    const handleSubmit = (e) => {
        e.preventDefault();
        // Handle form submission logic here using formData state
        console.log('Form Data:', formData);
    };

    return (
        <Box p={8}>
            <Heading mb={4}>Travel Website</Heading>

            <FormControl>
                <FormLabel>Destination:</FormLabel>
                <Input
                    placeholder="Enter your destination"
                    value={formData.destination}
                    onChange={(e) =>
                        setFormData({ ...formData, destination: e.target.value })
                    }
                />
            </FormControl>

            <Flex mt={4}>
                <FormControl mr={4}>
                    <FormLabel>From Date:</FormLabel>
                    <Input
                        type="date"
                        value={formData.fromDate}
                        onChange={(e) =>
                            setFormData({ ...formData, fromDate: e.target.value })
                        }
                    />
                </FormControl>

                <FormControl mr={4}>
                    <FormLabel>To Date:</FormLabel>
                    <Input
                        type="date"
                        value={formData.toDate}
                        onChange={(e) =>
                            setFormData({ ...formData, toDate: e.target.value })
                        }
                    />
                </FormControl>

                <FormControl>
                    <FormLabel>Number of People:</FormLabel>
                    <Input
                        type="number"
                        value={formData.numberOfPeople}
                        onChange={(e) =>
                            setFormData({ ...formData, numberOfPeople: e.target.value })
                        }
                    />
                </FormControl>
            </Flex>

            <Button mt={4} colorScheme="teal" onClick={handleSubmit}>
                Submit
            </Button>
        </Box>
    );
};
export default Home;